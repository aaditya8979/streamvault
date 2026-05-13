package com.trello.rxlifecycle2;

import xl.k;

/* JADX INFO: loaded from: classes3.dex */
public interface LifecycleProvider<E> {
    <T> LifecycleTransformer<T> bindToLifecycle();

    <T> LifecycleTransformer<T> bindUntilEvent(E e10);

    k<E> lifecycle();
}
