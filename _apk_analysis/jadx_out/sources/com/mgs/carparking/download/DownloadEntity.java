package com.mgs.carparking.download;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import cc.a;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.netbean.DownloadListener;
import up.b;
import up.f;

/* JADX INFO: loaded from: classes7.dex */
@f(name = "download_history")
public class DownloadEntity extends BaseObservable implements DownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b(name = "url")
    public String f43857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b(name = DownloadModel.FILE_NAME)
    public String f43858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b(name = "origin_file_name")
    public String f43859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b(name = "length")
    public long f43860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b(name = "progress")
    public int f43861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b(name = "curr_position")
    public long f43862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b(name = "status")
    public int f43863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b(name = "file_type")
    public int f43864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b(name = SearchHistoryEntity.CREATE_TIME)
    public long f43865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b(name = "local_path")
    public String f43866k;

    public long d() {
        return this.f43865j;
    }

    @Bindable
    public long g() {
        return this.f43862g;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public long getLength() {
        return this.f43860e;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public String getLocalPath() {
        return this.f43866k;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public String getUrl() {
        return this.f43857b;
    }

    @Bindable
    public String h() {
        return this.f43858c;
    }

    public int i() {
        return this.f43864i;
    }

    public String j() {
        return this.f43859d;
    }

    @Bindable
    public int k() {
        return this.f43863h;
    }

    public void l(long j10) {
        this.f43862g = j10;
        notifyPropertyChanged(1);
    }

    public void m(int i10) {
        this.f43863h = i10;
        notifyPropertyChanged(5);
        a.a().b(this.f43857b, this.f43858c, i10, this.f43862g, this.f43860e);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onCanceled() {
        m(5);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onFailed() {
        m(2);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onPaused() {
        m(4);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onSuccess() {
        m(1);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void setLength(long j10) {
        this.f43860e = j10;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void setProgress(int i10) {
        this.f43861f = i10;
        notifyPropertyChanged(4);
        l((((long) i10) * this.f43860e) / 100);
    }

    public String toString() {
        return "DownloadEntity{fileName='" + this.f43858c + "'}";
    }
}
