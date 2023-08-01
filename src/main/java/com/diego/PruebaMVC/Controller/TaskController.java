
package com.diego.PruebaMVC.Controller;

import com.diego.PruebaMVC.model.Task;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TaskController {
    
    private List<Task> tasks = new ArrayList<>();
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("tasks", tasks);
        return "index";
    }
    
    @PostMapping("/addTask")
    public String addTask(@RequestParam String description){
        tasks.add(new Task(description));
        return "redirect:/";
    }
    
    @PostMapping("/deleteTask")
    public String deleteTask(@RequestParam int index){
        tasks.remove(index);
        return "redirect:/";
    }
}
