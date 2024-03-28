package com.nguyenkunquan.interchangefrontendcustomer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/consulting")
    public String createQuotation() {
        return "dang-ki-tu-van";
    }
    @GetMapping("/my-projects")
    public String viewMyProjects() {
        return "ui-danhsachduancuaban";
    }
    @GetMapping("/my-project/quotations")
    public String viewMyQuotationsOfProject() {
        return "ui-xemdanhsachbaogiacuaduan";
    }
    @GetMapping("/quotation-information")
    public String quotationInformation() {
        return "ui-thongtinbaogia";
    }
    @GetMapping("/register-quotation")
    public String registerQuotation() {
        return "dang-ki-bao-gia";
    }

}
