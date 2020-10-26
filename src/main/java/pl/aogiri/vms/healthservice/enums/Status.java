package pl.aogiri.vms.healthservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ONLINE,
    OFFLINE;

    @JsonValue
    public final String value() {
        return this.name();
    }
}
