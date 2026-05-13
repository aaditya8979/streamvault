package zf;

import androidx.collection.ArrayMap;
import bo.d0;
import com.yandex.div.internal.Assert;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Serialization.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @NotNull
    public static final Map<String, String> a(@Nullable String str) {
        if (str == null) {
            return kotlin.collections.a.j();
        }
        List listT0 = d0.T0(str, new char[]{0}, false, 0, 6, null);
        if (listT0.isEmpty()) {
            Assert.fail("Incorrect serialization: empty map should be serialized into null value!");
            return kotlin.collections.a.j();
        }
        ArrayMap arrayMap = new ArrayMap(listT0.size());
        int size = listT0.size();
        for (int i10 = 0; i10 < size; i10++) {
            List listT02 = d0.T0((CharSequence) listT0.get(i10), new char[]{'\t'}, false, 0, 6, null);
            if (listT02.size() == 1) {
                arrayMap.put(listT02.get(0), "");
            } else {
                arrayMap.put(listT02.get(0), listT02.get(1));
            }
        }
        return arrayMap;
    }

    @Nullable
    public static final String b(@NotNull Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb2.append(key);
            sb2.append('\t');
            sb2.append(value);
            sb2.append((char) 0);
        }
        return sb2.toString();
    }
}
