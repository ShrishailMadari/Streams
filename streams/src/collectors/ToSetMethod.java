package collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*Great question — and yes, the **order** of elements in your output seems surprising at first glance.

Let’s break this down clearly:

---

## 💡 Your Code:
```java
Set<String> collect = Stream.of("Shrihari", "ShriGuru", "Shrihari", "Shrishail", "Shridhara")
    .collect(Collectors.toSet());

System.out.println(collect);
```

## ✅ Output (Example):
```
[Shrishail, Shrihari, ShriGuru, Shridhara]
```

---

## 🔍 Why is the order different?

The method you're using:

```java
Collectors.toSet()
```

**returns a HashSet**, and a `HashSet`:

- **Does not maintain insertion order**
- Internally uses a **hash table** for storing elements
- Order is based on the hash codes of the elements
- So the output order is **not guaranteed** and may change between runs or JDK versions

---

## ✅ If you want to preserve insertion order:

Use:
```java
Collectors.toCollection(LinkedHashSet::new)
```

👉 Updated code:
```java
Set<String> collect = Stream.of("Shrihari", "ShriGuru", "Shrihari", "Shrishail", "Shridhara")
    .collect(Collectors.toCollection(LinkedHashSet::new));

System.out.println(collect);
```

🟢 Output:
```
[Shrihari, ShriGuru, Shrishail, Shridhara]
```

Now the duplicates are removed **but the insertion order is preserved**.

---

## ✅ Summary:

| Collector | Set Type        | Maintains Order? |
|-----------|------------------|------------------|
| `toSet()` | `HashSet`        | ❌ No            |
| `toCollection(LinkedHashSet::new)` | `LinkedHashSet` | ✅ Yes           |

---

Would you like a flow diagram explaining how `Collectors.toSet()` works internally vs `toCollection()`?*/
public class ToSetMethod {
    public static void main(String[] args) {
        Set<String> collect = Stream.of("Shrihari", "ShriGuru", "Shrihari", "Shrishail", "Shridhara")
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
