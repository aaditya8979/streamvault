package ns;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Map<String, List<String>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f75964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75965c;

    public a() {
        this.f75964b = new HashMap(32);
        this.f75965c = true;
    }

    public a(ByteArrayInputStream byteArrayInputStream) {
        this.f75964b = new HashMap(32);
        this.f75965c = true;
        StringBuilder sb2 = new StringBuilder(256);
        a aVar = new a();
        String strK = k(sb2, byteArrayInputStream);
        if (strK.length() != 0) {
            String str = null;
            do {
                char cCharAt = strK.charAt(0);
                if (str == null || !(cCharAt == ' ' || cCharAt == '\t')) {
                    String[] strArrM = m(strK);
                    aVar.a(strArrM[0], strArrM[1]);
                    str = strArrM[0];
                } else {
                    List<String> list = aVar.get(str);
                    int size = list.size() - 1;
                    list.set(size, list.get(size) + strK.trim());
                }
                sb2.delete(0, sb2.length());
                strK = k(sb2, byteArrayInputStream);
            } while (strK.length() != 0);
        }
        putAll(aVar);
    }

    public a(Map<String, List<String>> map) {
        this.f75964b = new HashMap(32);
        this.f75965c = true;
        putAll(map);
    }

    public a(boolean z10) {
        this.f75964b = new HashMap(32);
        this.f75965c = z10;
    }

    public static String j(ByteArrayInputStream byteArrayInputStream) {
        return k(new StringBuilder(256), byteArrayInputStream);
    }

    public static String k(StringBuilder sb2, ByteArrayInputStream byteArrayInputStream) {
        while (true) {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                break;
            }
            char c10 = (char) i10;
            if (c10 == '\r') {
                if (((char) byteArrayInputStream.read()) == '\n') {
                    break;
                }
                sb2.append(c10);
            } else {
                if (c10 == '\n') {
                    break;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public void a(String str, String str2) {
        String strG = g(str);
        List<String> linkedList = this.f75964b.get(strG);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f75964b.put(strG, linkedList);
        }
        linkedList.add(str2);
    }

    public int b(String str) {
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return length;
    }

    public int c(String str, int i10) {
        while (i10 < str.length() && Character.isWhitespace(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    @Override // java.util.Map
    public void clear() {
        this.f75964b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return obj != null && (obj instanceof String) && this.f75964b.containsKey(g((String) obj));
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f75964b.containsValue(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<String> get(Object obj) {
        return this.f75964b.get(g((String) obj));
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, List<String>>> entrySet() {
        return this.f75964b.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f75964b.equals(obj);
    }

    public String f(String str) {
        List<String> list = this.f75964b.get(g(str));
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public final String g(String str) {
        if (!this.f75965c) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c10 = charArray[0];
        if (c10 >= 'a' && c10 <= 'z') {
            charArray[0] = (char) (c10 - ' ');
        }
        int length = str.length();
        for (int i10 = 1; i10 < length; i10++) {
            char c11 = charArray[i10];
            if (c11 >= 'A' && c11 <= 'Z') {
                charArray[i10] = (char) (c11 + ' ');
            }
        }
        return new String(charArray);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> put(String str, List<String> list) {
        return this.f75964b.put(g(str), list);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f75964b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f75964b.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f75964b.keySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<String> remove(Object obj) {
        return this.f75964b.remove(g((String) obj));
    }

    public String[] m(String str) {
        char cCharAt;
        int iC = c(str, 0);
        int i10 = iC;
        while (i10 < str.length() && (cCharAt = str.charAt(i10)) != ':' && !Character.isWhitespace(cCharAt)) {
            i10++;
        }
        int i11 = i10;
        while (true) {
            if (i11 >= str.length()) {
                break;
            }
            if (str.charAt(i11) == ':') {
                i11++;
                break;
            }
            i11++;
        }
        int iC2 = c(str, i11);
        int iB = b(str);
        String[] strArr = new String[2];
        strArr[0] = str.substring(iC, i10);
        strArr[1] = (str.length() < iC2 || str.length() < iB || iC2 >= iB) ? null : str.substring(iC2, iB);
        return strArr;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends List<String>> map) {
        for (Map.Entry<? extends String, ? extends List<String>> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f75964b.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        for (Map.Entry<String, List<String>> entry : entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(": ");
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(StringUtils.COMMA);
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append("\r\n");
        }
        return sb2.toString();
    }

    @Override // java.util.Map
    public Collection<List<String>> values() {
        return this.f75964b.values();
    }
}
