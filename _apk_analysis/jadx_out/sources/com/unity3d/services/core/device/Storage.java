package com.unity3d.services.core.device;

import bn.r;
import bo.c;
import cn.f0;
import cn.w;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import go.l;
import go.v;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes9.dex */
public class Storage extends JsonStorage {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final l<List<sn.l<StorageEventInfo, r>>> onStorageEventCallbacks = v.a(w.m());

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    /* JADX INFO: compiled from: Storage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void addStorageEventCallback(@NotNull sn.l<? super StorageEventInfo, r> lVar) {
            Object value;
            p.k(lVar, "callback");
            l lVar2 = Storage.onStorageEventCallbacks;
            do {
                value = lVar2.getValue();
            } while (!lVar2.b(value, f0.P0((List) value, lVar)));
        }

        public final void removeStorageEventCallback(@NotNull sn.l<? super StorageEventInfo, r> lVar) {
            Object value;
            p.k(lVar, "callback");
            l lVar2 = Storage.onStorageEventCallbacks;
            do {
                value = lVar2.getValue();
            } while (!lVar2.b(value, f0.M0((List) value, lVar)));
        }
    }

    public Storage(@NotNull String str, @NotNull StorageManager.StorageType storageType) {
        p.k(str, "_targetFileName");
        p.k(storageType, "type");
        this._targetFileName = str;
        this.type = storageType;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] fileBytes;
        boolean z10 = true;
        try {
            try {
                fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e10) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e10);
            }
        } catch (Exception e11) {
            DeviceLog.debug("Failed to read storage JSON file:", e11);
        }
        if (fileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(fileBytes, c.f5639b)));
        return z10;
        z10 = false;
        return z10;
    }

    public final synchronized void sendEvent(@Nullable StorageEvent storageEvent, @Nullable Object obj) {
        List<sn.l<StorageEventInfo, r>> value = onStorageEventCallbacks.getValue();
        if (!(!value.isEmpty())) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        p.h(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            ((sn.l) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
