package com.pnu.skynet.trainingmanagerapi.controller.dto;

import com.pnu.skynet.trainingmanagerapi.constant.BodyPart;

import java.util.Set;

public record ExerciseCreateRequest(
        String name,
        Set<BodyPart> relatedBodyParts) {

}
