package com.andrew.catfoodadviser.config.web;

import lombok.Setter;
import org.springframework.core.MethodParameter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Setter
public class SimplePageRequestHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    private static final String DEFAULT_OFFSET_PARAMETER = "offset";
    private static final String DEFAULT_SIZE_PARAMETER = "size";

    private static final long DEFAULT_OFFSET = 0;
    private static final long MIN_OFFSET = 0;
    private static final long MAX_OFFSET = Integer.MAX_VALUE;

    private static final int DEFAULT_SIZE = 5;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 5;

    private String offsetParameterName = DEFAULT_OFFSET_PARAMETER;
    private String sizeParameterName = DEFAULT_SIZE_PARAMETER;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Pageable.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public SimplePageRequest resolveArgument(
            @NonNull MethodParameter methodParameter,
            @Nullable ModelAndViewContainer mavContainer,
            @NonNull NativeWebRequest webRequest,
            @Nullable WebDataBinderFactory binderFactory
    ) {
        if (supportsParameter(methodParameter)) {
            String offsetString = webRequest.getParameter(offsetParameterName);
            String sizeString = webRequest.getParameter(sizeParameterName);
            return new SimplePageRequest(validOffset(offsetString), validSize(sizeString));
        }
        return null;
    }

    private int validSize(String sizeStr) {
        Integer size;
        try {
            size = Integer.parseInt(sizeStr);
        } catch (NumberFormatException ne) {
            size = null;
        }
        if (size == null || size < MIN_SIZE || size > MAX_SIZE) return DEFAULT_SIZE;
        return size;
    }

    private long validOffset(String offsetString) {
        Long offset;
        try {
            offset = Long.parseLong(offsetString);
        } catch (NumberFormatException ne) {
            offset = null;
        }
        if (offset == null || offset < MIN_OFFSET || offset > MAX_OFFSET) return DEFAULT_OFFSET;
        return offset;
    }
}