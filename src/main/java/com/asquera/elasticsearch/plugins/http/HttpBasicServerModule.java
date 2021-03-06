package com.asquera.elasticsearch.plugins.http;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.http.HttpServerModule;

/**
 * @author Florian Gilcher (florian.gilcher@asquera.de)
 */
public class HttpBasicServerModule extends HttpServerModule {

	public HttpBasicServerModule(Settings settings) {
		super(settings);
	}

	@Override
	protected void configure() {
		super.configure();
		bind(HttpBasicServer.class).asEagerSingleton();
	}
}

