
# React Props
React Props are like function arguments in JavaScript and attributes in HTML.
To send props into a component, use the same syntax as HTML attributes:

## 1. Using `(props)` directly

Child receives the whole `props` object.

```jsx
const ReactChild = (props) => {
  return (
    <div>
      <h2>Hello, {props.username}</h2>
      <p>Name : {props.profile.name}</p>
      <p>Phone : {props.profile.phone}</p>
      <p>Email : {props.profile.email}</p>
      <p>Address : {props.profile.address}</p>
    </div>
  );
};
```

### When to use

* When you want to **see all props** passed in console:
  `console.log(props)`
* Quick debugging or when you don’t know exact props.

---

## 2. Destructuring inside function parameter

Take values directly instead of `props.something`.

```jsx
const ReactChild = ({ username, profile }) => {
  return (
    <div>
      <h2>Hello, {username}</h2>
      <p>Name : {profile.name}</p>
      <p>Phone : {profile.phone}</p>
      <p>Email : {profile.email}</p>
      <p>Address : {profile.address}</p>
    </div>
  );
};
```

### When to use

* Cleaner code.
* Use when you know exactly what props you expect.

---

## 3. Destructuring inside function body

Sometimes you don’t want to destructure in parameters. You can do it in the body.

```jsx
const ReactChild = (props) => {
  const { username, profile } = props;  

  return (
    <div>
      <h2>Hello, {username}</h2>
      <p>Name : {profile.name}</p>
      <p>Phone : {profile.phone}</p>
      <p>Email : {profile.email}</p>
      <p>Address : {profile.address}</p>
    </div>
  );
};
```

### When to use

* Useful if you want to **log props** and then destructure.
* Good balance of readability and flexibility.

---

## 4. Nested destructuring

If props contain nested objects, destructure them directly.

```jsx
const ReactChild = ({ profile: { name, phone, email, address } }) => {
  return (
    <div>
      <p>Name : {name}</p>
      <p>Phone : {phone}</p>
      <p>Email : {email}</p>
      <p>Address : {address}</p>
    </div>
  );
};
```

### When to use

* When props are deeply nested.
* Reduces repeated `profile.` usage.

---

## 5. Default values in destructuring

Set default props if not passed.

```jsx
const ReactChild = ({ username = "Guest", profile = {} }) => {
  return (
    <div>
      <h2>Hello, {username}</h2>
      <p>Name : {profile.name || "N/A"}</p>
      <p>Phone : {profile.phone || "N/A"}</p>
    </div>
  );
};
```

### When to use

* Prevents errors when parent forgets to send props.
* Makes component safer.

---

# Summary Table

| Case                       | Syntax                       | Best For                |
| -------------------------- | ---------------------------- | ----------------------- |
| (props)                    | `props.username`             | Debugging, quick checks |
| Destructuring in parameter | `({ username })`             | Clean, short code       |
| Destructuring in body      | `const { username } = props` | Flexibility, logging    |
| Nested destructuring       | `({ profile: { name } })`    | Deeply nested props     |
| Default values             | `({ username = "Guest" })`   | Safe props handling     |

---

Would you like me to also show a **real-world example** where each of these cases is useful (like profile card, login button, etc.)?
