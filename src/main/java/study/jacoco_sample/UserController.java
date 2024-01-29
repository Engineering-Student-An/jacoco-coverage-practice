package study.jacoco_sample;//package study.jacocopractice;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//@RequiredArgsConstructor
//public class UserController {
//
//    private final UserController userController;
//
//    @GetMapping("")
//    public String home(Model model,
//                       @PageableDefault(size = Integer.MAX_VALUE, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
//        Page<User> members = userController.findAll(pageable);
//        model.addAttribute("members", members);
//        model.addAttribute("membersCount", members.getTotalElements());
//        model.addAttribute("joinRequest", new JoinRequest());
//        return "home";
//    }
//
//    @PostMapping("/join")
//    public String join(@ModelAttribute JoinRequest joinRequest, Model model) {
//        memberService.join(joinRequest);
//        return "redirect:/";
//    }
//}
