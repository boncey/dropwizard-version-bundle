package io.dropwizard.bundles.version;

import com.google.common.base.Supplier;

/**
 * Supplier interface that provides an application's version number.
 */
public interface VersionSupplier extends Supplier<String> {
}