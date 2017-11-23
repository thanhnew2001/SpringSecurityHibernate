package controller;

import model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by CoT on 11/21/17.
 */
@RestController
public class LecturerController {

    //MAKE SURE only users with the role ROLE_LECTURER can access this resource

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public String getLecturers(){
        return "all lecturers";
    }

}
