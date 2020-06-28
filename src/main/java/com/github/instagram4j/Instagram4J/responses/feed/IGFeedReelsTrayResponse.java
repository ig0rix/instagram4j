package com.github.instagram4j.Instagram4J.responses.feed;

import java.util.List;

import com.github.instagram4j.Instagram4J.models.feed.IGTray;
import com.github.instagram4j.Instagram4J.responses.IGResponse;

import lombok.Data;

@Data
public class IGFeedReelsTrayResponse extends IGResponse {
    private List<IGTray> tray;
    private List<Object> broadcasts;
}