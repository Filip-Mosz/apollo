package com.filipmoszczynski.core.pagination;

public class Metadata {

    public Metadata( int size, int page, int totalPages, long totalElements) {
        this.size = size;
        this.page = page;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }

    private final int totalPages;
    private final long totalElements;
    private final int size;
    private final int page;

    public int getTotalPages() {
        return totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public int getSize() {
        return size;
    }

    public int getPage() {
        return page;
    }
}
