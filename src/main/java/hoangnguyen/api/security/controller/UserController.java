package hoangnguyen.api.security.controller;

import hoangnguyen.api.security.services.UserService;
import hoangnguyen.api.security.DTO.ChangePasswordRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PatchMapping
    public ResponseEntity<?> changePassword(
            @RequestBody ChangePasswordRequestDTO request,
            Principal connectedUser
    ){
        userService.changePassword(request,connectedUser);
        return ResponseEntity.ok().build();
    }

}
