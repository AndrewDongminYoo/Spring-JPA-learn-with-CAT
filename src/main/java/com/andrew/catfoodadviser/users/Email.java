package com.andrew.catfoodadviser.users;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.regex.Pattern.matches;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Getter
@EqualsAndHashCode
@ToString
public class Email {

    private final String address;

    public Email(String address) {
        checkArgument(isNotEmpty(address), "address must be provided");
        checkArgument(
                address.length() >= 4 && address.length() <= 50,
                "address length must be between 4 and 50 characters"
        );
        checkArgument(checkAddress(address), "Invalid email address: " + address);

        this.address = address;
    }

    public static Email of(String address) {
        return new Email(address);
    }

    private static boolean checkAddress(String address) {
        return matches("[\\w~\\-.+]+@[\\w~\\-]+(\\.[\\w~\\-]+)+", address);
    }
}