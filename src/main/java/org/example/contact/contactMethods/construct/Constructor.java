package org.example.contact.contactMethods.construct;

import java.util.List;

public interface Constructor<T,K> {
    void  construct(List<T> firstParameter, List<K> secondParameter);
}
