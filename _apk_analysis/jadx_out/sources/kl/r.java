package kl;

import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import un.e;

/* JADX INFO: compiled from: CaseInsensitiveMap.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r<Key, Value> implements Map.Entry<Key, Value>, e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f73167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Value f73168c;

    public r(Key key, Value value) {
        this.f73167b = key;
        this.f73168c = value;
    }

    public void a(Value value) {
        this.f73168c = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return tn.p.f(entry.getKey(), getKey()) && tn.p.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.f73167b;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.f73168c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        tn.p.h(key);
        int iHashCode = key.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Value value = getValue();
        tn.p.h(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        a(value);
        return getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(G5.T);
        sb2.append(getValue());
        return sb2.toString();
    }
}
