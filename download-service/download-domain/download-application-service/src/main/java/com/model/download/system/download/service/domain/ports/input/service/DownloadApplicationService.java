package com.model.download.system.download.service.domain.ports.input.service;

import com.model.download.system.download.service.domain.dto.create.CreateDownloadCommand;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadResponse;
import com.model.download.system.download.service.domain.dto.track.TrackDownloadQuery;
import com.model.download.system.download.service.domain.dto.track.TrackDownloadResponse;

import javax.validation.Valid;

public interface DownloadApplicationService {

    CreateDownloadResponse creteDownload(@Valid CreateDownloadCommand createDownloadCommand);

    TrackDownloadResponse trackDownload(@Valid TrackDownloadQuery trackDownloadQuery);
}
