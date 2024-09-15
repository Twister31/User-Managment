package net.java.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.java.springboot.dto.UserDto;
import net.java.springboot.entity.User;
import net.java.springboot.repository.UserRepository;
import net.java.springboot.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private ModelMapper modelMapper;

//    @Override
//    public UserDto createUser(UserDto userDto) {
//
//        // convert UserDto into User JPA Entity
//        User user = UserMapper.mapToUser(userDto);
//        User savedUser = userRepository.save(user);
//
//        // Convert user JPA entity to UserDto
//        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
//
//        return savedUserDto;
//    }

    @Override
    public UserDto createUser(UserDto userDto) {

        // convert UserDto into User JPA Entity
        User user = modelMapper.map(userDto, User.class);
        User savedUser = userRepository.save(user);

        // Convert user JPA entity to UserDto
        UserDto savedUserDto = modelMapper.map(savedUser, UserDto.class);

        return savedUserDto;
    }

//    @Override
//    public UserDto getUserById(long userId) {
//        Optional<User> optionalUser = userRepository.findById(userId);
//        User user = optionalUser.get();
//        return UserMapper.mapToUserDto(user);
//    }

    @Override
    public UserDto getUserById(long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.get();
        return modelMapper.map(user, UserDto.class);
    }

//    @Override
//    public List<UserDto> getAllUsers() {
//        List<User> users =  userRepository.findAll();
//        return users.stream().map(UserMapper::mapToUserDto)
//                .collect(Collectors.toList());
//    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users =  userRepository.findAll();
        return users.stream().map((user) -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

//    @Override
//    public UserDto updateUser(UserDto user) {
//        User userToUpdate = userRepository.findById(user.getId()).get();
//        userToUpdate.setFirstName(user.getFirstName());
//        userToUpdate.setLastName(user.getLastName());
//        userToUpdate.setEmail(user.getEmail());
//        User updatedUser = userRepository.save(userToUpdate);
//        return UserMapper.mapToUserDto(updatedUser);
//    }

    @Override
    public UserDto updateUser(UserDto user) {
        User userToUpdate = userRepository.findById(user.getId()).get();
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        User updatedUser = userRepository.save(userToUpdate);
        return modelMapper.map(updatedUser, UserDto.class);
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}
