package com.parkk.web.proxy;

@FunctionalInterface
public interface ISupplier<T> {
    T get();
}
