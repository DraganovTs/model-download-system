package com.model.download.system.domain.valueobject;

import java.util.UUID;

public class ModelId extends BaseId<UUID> {
    protected ModelId(UUID value) {
        super(value);
    }
}
