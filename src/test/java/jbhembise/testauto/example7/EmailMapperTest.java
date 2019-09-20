package jbhembise.testauto.example7;

import org.junit.Test;

public class EmailMapperTest {

    @Test
    public void should_map_email() {
        Email email = new Email("subject", "content", "noreply@ekino.com", new String[] { "to@ekino.com" });
        EmailDto emailDto = EmailMapper.toDto(email);
        //Assert.assertEquals("subject", emailDto.getSubject());
    }

}
