package net.java.springboot.mapper;

import net.java.springboot.dto.UserDto;
import net.java.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
//    @Mapping(source = "email", target = "emailAddress")
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
