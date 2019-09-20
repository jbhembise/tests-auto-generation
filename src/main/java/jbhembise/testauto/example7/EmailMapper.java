package jbhembise.testauto.example7;

import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class EmailMapper {

    public static EmailDto toDto(Email email) {
        EmailDto dto = new EmailDto();
        dto.setFrom(email.getFrom());
        dto.setContent(email.getContent());
        dto.setSubject(email.getSubject());
        dto.setTo(Arrays.stream(email.getTo()).collect(toList()));
        return dto;
    }
}
