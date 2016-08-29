package com.zensar.uac.web.crawler.services;

/**
 * @author Sagar Balai
 *         UACService is responsible to create crawling report for new URL or already processed URL's.
 *         This is basic interface and exposed to external user and will act as starting point for this web crawler application.
 */
public interface UACService {

    void crawl(String URL, String emailID);

    void generateReport();
}
