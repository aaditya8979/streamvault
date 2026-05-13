package com.trello.rxlifecycle2.android;

import android.view.View;
import xl.m;
import xl.n;
import yl.a;

/* JADX INFO: loaded from: classes7.dex */
final class ViewDetachesOnSubscribe implements n<Object> {
    public static final Object SIGNAL = new Object();
    public final View view;

    public class EmitterListener extends a implements View.OnAttachStateChangeListener {
        public final m<Object> emitter;

        public EmitterListener(m<Object> mVar) {
            this.emitter = mVar;
        }

        @Override // yl.a
        public void onDispose() {
            ViewDetachesOnSubscribe.this.view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.emitter.onNext(ViewDetachesOnSubscribe.SIGNAL);
        }
    }

    public ViewDetachesOnSubscribe(View view) {
        this.view = view;
    }

    @Override // xl.n
    public void subscribe(m<Object> mVar) throws Exception {
        a.verifyMainThread();
        EmitterListener emitterListener = new EmitterListener(mVar);
        mVar.setDisposable(emitterListener);
        this.view.addOnAttachStateChangeListener(emitterListener);
    }
}
