package yads;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class cd0 extends Exception {
    public cd0(UUID uuid) {
        super("Media does not support uuid: " + uuid);
    }
}
