package com.model.download.system.download.service.domain.entity;

import com.model.download.system.domain.entity.BaseEntity;
import com.model.download.system.domain.valueobject.DownloadId;
import com.model.download.system.domain.valueobject.Money;
import com.model.download.system.download.service.domain.valueobject.DownloadItemId;


public class DownloadItem extends BaseEntity<DownloadItemId> {
    private DownloadId downloadId;
    private final Model model;
    private final int quantity;
    private final Money price;
    private final Money subTotal;


     void initializeDownloadItem(DownloadId downloadId, DownloadItemId downloadItemId) {
        this.downloadId = downloadId;
        super.setId(downloadItemId);
    }

    boolean isPriceValid(){
         return price.isGreaterThanZero() &&
                 price.equals(model.getPrice()) &&
                 price.multiply(quantity).equals(subTotal);
    }

    private DownloadItem(Builder builder) {
        super.setId(builder.downloadItemId);
        downloadId = builder.downloadId;
        model = builder.model;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }


    public DownloadId getDownloadId() {
        return downloadId;
    }

    public Model getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }


    public static final class Builder {
        private DownloadItemId downloadItemId;
        private DownloadId downloadId;
        private Model model;
        private int quantity;
        private Money price;
        private Money subTotal;


        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder downloadItemId(DownloadItemId val) {
            downloadItemId = val;
            return this;
        }

        public Builder downloadId(DownloadId val) {
            downloadId = val;
            return this;
        }

        public Builder model(Model val) {
            model = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Builder subTotal(Money val) {
            subTotal = val;
            return this;
        }

        public DownloadItem build() {
            return new DownloadItem(this);
        }
    }
}
