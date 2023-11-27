package com.model.download.system.download.service.domain.exception;

public class DownloadNotFindException extends DownloadDomainException{
    public DownloadNotFindException(String message) {
        super(message);
    }

    public DownloadNotFindException(String message, Throwable cause) {
        super(message, cause);
    }
}
