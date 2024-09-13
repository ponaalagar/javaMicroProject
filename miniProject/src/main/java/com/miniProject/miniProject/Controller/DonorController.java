package com.miniProject.miniProject.Controller;

import com.miniProject.miniProject.Model.Modal;
import com.miniProject.miniProject.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/donors")
public class DonorController {
    @Autowired
    private DonorService donorService;

    @GetMapping
    public String getAllDonors(Model model) {
        List<Modal> donors = donorService.getAllDonors();
        model.addAttribute("donors", donors);
        return "donors";
    }

    @GetMapping("/new")
    public String createDonorForm(Model model) {
        model.addAttribute("donor", new Modal());
        return "create_donor";
    }

    @PostMapping
    public String saveDonor(@ModelAttribute Modal donor) {
        donorService.saveDonor(donor);
        return "redirect:/donors";
    }
}
