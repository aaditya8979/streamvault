package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: NonBehavioralFlagReader.kt */
/* JADX INFO: loaded from: classes9.dex */
public class NonBehavioralFlagReader {

    @NotNull
    private final IJsonStorageReader jsonStorageReader;

    public NonBehavioralFlagReader(@NotNull IJsonStorageReader iJsonStorageReader) {
        p.k(iJsonStorageReader, "jsonStorageReader");
        this.jsonStorageReader = iJsonStorageReader;
    }

    @NotNull
    public NonBehavioralFlag getUserNonBehavioralFlag() {
        Object obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_KEY);
        if (obj == null) {
            obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_ALT_KEY);
        }
        return NonBehavioralFlag.Companion.fromString(String.valueOf(obj));
    }
}
