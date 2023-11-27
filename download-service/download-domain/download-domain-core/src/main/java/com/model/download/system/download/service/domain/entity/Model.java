package com.model.download.system.download.service.domain.entity;

import com.model.download.system.domain.entity.BaseEntity;
import com.model.download.system.domain.valueobject.ModelId;
import com.model.download.system.domain.valueobject.Money;

public class Model extends BaseEntity<ModelId> {
    private String name;
    private String zipFile;
    private String imageFile;
    private Money price;

    public Model(ModelId modelId, String name, String zipFile, String imageFile, Money price) {
        super.setId(modelId);
        this.name = name;
        this.zipFile = zipFile;
        this.imageFile = imageFile;
        this.price = price;
    }

    public void updateWithConfirmedNameAndPrice(String name, String zipFile,
                                                String imageFile, Money price) {
        this.name = name;
        this.imageFile = imageFile;
        this.zipFile = zipFile;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getZipFile() {
        return zipFile;
    }

    public String getImageFile() {
        return imageFile;
    }

    public Money getPrice() {
        return price;
    }
}
