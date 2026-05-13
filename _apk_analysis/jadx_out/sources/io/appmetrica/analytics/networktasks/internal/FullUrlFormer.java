package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f68283a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68284b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f68285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f68286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f68287e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f68286d = iParamsAppender;
        this.f68287e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f68283a.get(this.f68284b)).buildUpon();
        this.f68286d.appendParams(builderBuildUpon, this.f68287e.getConfig());
        this.f68285c = builderBuildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f68283a;
    }

    @Nullable
    public String getUrl() {
        return new c(this.f68285c).f68258a;
    }

    public boolean hasMoreHosts() {
        return this.f68284b + 1 < this.f68283a.size();
    }

    public void incrementAttemptNumber() {
        this.f68284b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f68283a = list;
    }
}
