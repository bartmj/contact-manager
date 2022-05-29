package com.example.contacts.contacts.adapters.web;

import com.example.contacts.commons.Page;
import com.example.contacts.commons.ResultPage;
import com.example.contacts.contacts.domain.Contact;
import com.example.contacts.contacts.ports.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RequestMapping
@Controller
@RequiredArgsConstructor
public class ContactWebController {

    private final ContactService contactService;
    private final WebContactMapper mapper;


    @GetMapping
    public String showContactForm(Model model) {
        var contactViewModel = new ContactViewModel();
        model.addAttribute("contactViewModel", contactViewModel);
        return "contacts/contact-form";
    }

    @GetMapping("all")
    public String seeAll(Model model) {
        var contacts = contactService.getAll();
        var contactViewModels = mapper.toViewModel(contacts);
        model.addAttribute("contactsPage", contactViewModels);
        return "contacts/contact-list";
    }

    @PostMapping
    public String add(@Valid @ModelAttribute ContactViewModel contactViewModel, RedirectAttributes redirectAttributes) {
        var contact = mapper.toDomain(contactViewModel);
        var savedContact = contactService.addContact(contact);
        var viewModel = mapper.toViewModel(savedContact);
        redirectAttributes.addFlashAttribute("contact", viewModel);
        return "redirect:/contacts/contact-added";
    }

}
