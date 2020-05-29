package com.company.license.controller;

import com.company.license.entity.CertificateTitleType;
import com.company.license.service.CertificateTitleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/directories")
public class DirectoriesController {

    @Autowired
    private CertificateTitleTypeService certificateTitleTypeService;

    @GetMapping("/certificateTitleType")
    public String getCertificateTitleType(@RequestParam(value = "itemId", required = false) Long itemId, Model model){
        model.addAttribute("items", certificateTitleTypeService.findAll());
        model.addAttribute("itemForUpdate", itemId == null ? new CertificateTitleType() : certificateTitleTypeService.findById(itemId));
        return "directories/certificateTitleType";
    }

    @PostMapping("/certificateTitleType")
    public String saveCertificateTitleType(@ModelAttribute("certTitType") CertificateTitleType certificateTitleType){
        certificateTitleTypeService.save(certificateTitleType);
        return "redirect:/directories/certificateTitleType";
    }

    @GetMapping("/delete/{itemId}")
    public String deleteCertificateTitleType(@PathVariable("itemId") Long itemId){
        certificateTitleTypeService.delete(itemId);
        return "redirect:/directories/certificateTitleType";
    }
}
