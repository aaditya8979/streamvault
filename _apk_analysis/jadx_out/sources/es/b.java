package es;

import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: compiled from: DeviceCapabilities.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StorageMedium[] f61338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StorageMedium[] f61339b = {StorageMedium.NOT_IMPLEMENTED};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecordQualityMode[] f61340c = {RecordQualityMode.NOT_IMPLEMENTED};

    public b(StorageMedium[] storageMediumArr) {
        this.f61338a = storageMediumArr;
    }

    public StorageMedium[] a() {
        return this.f61338a;
    }

    public StorageMedium[] b() {
        return this.f61339b;
    }

    public RecordQualityMode[] c() {
        return this.f61340c;
    }
}
