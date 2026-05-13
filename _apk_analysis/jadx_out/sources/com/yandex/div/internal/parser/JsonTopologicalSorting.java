package com.yandex.div.internal.parser;

import cn.f0;
import cn.w;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonTopologicalSorting.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonTopologicalSorting {

    @NotNull
    public static final JsonTopologicalSorting INSTANCE = new JsonTopologicalSorting();

    @NotNull
    private static final ValueValidator<String> TYPE_VALIDATOR = new ValueValidator() { // from class: sg.f
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
        }
    };

    private JsonTopologicalSorting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TYPE_VALIDATOR$lambda$0(String str) {
        return str.length() > 0;
    }

    private final Map<String, List<String>> parseTypeDependencies(ParsingContext parsingContext, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                ArrayList arrayList = new ArrayList();
                INSTANCE.readObjectDependencies(parsingContext, new TemplateParsingErrorLogger(parsingContext.getLogger(), next), jSONObject2, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        return linkedHashMap;
    }

    private final void processType(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) throws CyclicDependencyException {
        List listM;
        if (set.contains(str)) {
            throwCyclicDependency(f0.g1(set), str);
            throw new KotlinNothingValueException();
        }
        if (set2.contains(str)) {
            return;
        }
        List<String> list = map.get(str);
        if (list != null) {
            listM = new ArrayList();
            for (Object obj : list) {
                if (map.containsKey((String) obj)) {
                    listM.add(obj);
                }
            }
        } else {
            listM = null;
        }
        if (!(listM == null || listM.isEmpty())) {
            set.add(str);
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                processType((String) it.next(), map, set, set2, linkedHashMap);
            }
            set.remove(str);
        }
        set2.add(str);
        if (listM == null) {
            listM = w.m();
        }
        linkedHashMap.put(str, f0.l1(listM));
    }

    private final void readObjectDependencies(ParsingContext parsingContext, ParsingErrorLogger parsingErrorLogger, JSONObject jSONObject, boolean z10, List<String> list) throws JSONException {
        String parent = z10 ? readParent(parsingContext, jSONObject) : readOptionalParent(parsingContext, jSONObject);
        if (parent != null) {
            list.add(parent);
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONObject) {
                INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj, false, list);
            }
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            Object obj2 = jSONObject.get(itKeys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj3 = jSONArray.get(i10);
                    if (obj3 instanceof JSONObject) {
                        INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj3, false, list);
                    }
                }
            }
        }
    }

    private final String readOptionalParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final String readParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.read(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final Void throwCyclicDependency(List<String> list, String str) throws CyclicDependencyException {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int iIndexOf = list.indexOf(str); iIndexOf < size; iIndexOf++) {
            sb2.append(list.get(iIndexOf));
            sb2.append(" -> ");
        }
        sb2.append(str);
        throw new CyclicDependencyException(sb2.toString());
    }

    @NotNull
    public final Map<String, Set<String>> sort(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws JSONException, ParsingException, CyclicDependencyException {
        Map<String, List<String>> typeDependencies = parseTypeDependencies(parsingContext, jSONObject);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        Iterator<String> it = typeDependencies.keySet().iterator();
        while (it.hasNext()) {
            processType(it.next(), typeDependencies, linkedHashSet, linkedHashSet2, linkedHashMap);
        }
        return linkedHashMap;
    }
}
