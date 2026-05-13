package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import pp.b;

/* JADX INFO: loaded from: classes2.dex */
public class CATEGORYVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f43875f;

    public CATEGORYVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43875f = new b(new pp.a() { // from class: hc.a
            @Override // pp.a
            public final void call() {
                this.f63130a.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        startActivity(SearchContentVideoActivity.class);
    }
}
