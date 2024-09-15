package net.java.springboot.mapper;

import net.java.springboot.dto.UserDto;
import net.java.springboot.entity.User;

public class UserMapper {

    //convert user jpa entity into UserDto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }
    //convert UserDto into user jpa entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail()
        );
        return user;
    }
}
