# 📌 Solving Recurrences using Akra-Bazzi Theorem

## 🚀 Introduction
The **Akra-Bazzi theorem** helps solve recurrence relations of the form:

$$
T(N) = \sum_{i=1}^{k} g_i(N) T(h_i(N)) + f(N)
$$

where we solve for \( p \) using:

$$
\sum_{i=1}^{k} g_i(N) \cdot h_i(N)^p = 1
$$

The final complexity is:

$$
T(N) = \Theta \left( N^p + N^p \int_{1}^{N} \frac{f(u)}{u^{p+1}} du \right)
$$

---

## 📌 Example 1: **T(N) = 2T(N/2) + (N - 1)**

### **Step 1: Solve for \( p \)**
Using:

$$
2 \left(\frac{N}{2}\right)^p = 1
$$

$$
2^{1 - p} = 1
$$

Solving, we get:

$$
p = 1
$$

### **Step 2: Compute the Integral**
$$
\int_{1}^{N} \frac{(u - 1)}{u^2} du = \ln N
$$

### **Final Complexity**
$$
T(N) = \Theta(N \log N)
$$

✅ **Answer:** \( O(N \log N) \)

---

## 📌 Example 2: **T(N) = 2T(N/2) + (8/9)T(3N/4) + N²**

### **Step 1: Solve for \( p \)**
$$
2 \left(\frac{1}{2}\right)^p + \frac{8}{9} \left(\frac{3}{4}\right)^p = 1
$$

Solving, we get:

$$
p = 2
$$

### **Step 2: Compare \( f(N) \)**
Since \( f(N) = N^2 \) matches \( N^p \), we check:

$$
\int_{1}^{N} \frac{u^2}{u^{3}} du = \ln N
$$

### **Final Complexity**
$$
T(N) = \Theta(N^2 \log N)
$$

✅ **Answer:** \( O(N^2 \log N) \)

---

## 🎯 **Conclusion**
- **First Example:** \( O(N \log N) \)
- **Second Example:** \( O(N^2 \log N) \)

This method is powerful for solving complex recurrences in algorithms! 🚀

---

## 📌 How to View Properly in VS Code
1. Install the **Markdown+Math** extension from the **VS Code Extensions Marketplace**.
2. Use `Ctrl + Shift + V` to preview the Markdown file.
3. Alternatively, open the file in **Jupyter Notebook** or an online Markdown editor that supports LaTeX.

---

Now your formulas will render correctly! ✅ 🎯 Let me know if you need any more modifications. 🚀
