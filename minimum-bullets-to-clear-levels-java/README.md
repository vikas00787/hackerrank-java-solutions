# SuperHero Game – Minimum Bullets (Java)

## Problem

Ma5termind is playing an action game with **N levels**.
At each level there are **M enemies**.

Each enemy has:

* **Power (P)** → Number of bullets required to kill that enemy.
* **Bullets (B)** → Bullets obtained after killing that enemy.

### Rules

* Ma5termind needs bullets equal to the enemy's **power** to defeat it.
* After defeating an enemy, he **collects all the bullets** from that enemy.
* Once one enemy is defeated at a level, **all other enemies run away**.
* Bullets obtained at level **i** can only be used up to **level i+1**.
* Bullets carried before the start of the game **can be used at any level**.

### Goal

Find the **minimum number of bullets required before starting the game** so that Ma5termind can clear all levels.

---

## Approach

1. For each level, choose the enemy that requires the **minimum net bullets**.
2. Net bullets required is calculated as:

```
power - bullets
```

3. Select the enemy that minimizes this value.
4. Update the bullets after defeating that enemy.

This greedy approach ensures the **minimum starting bullets**.

---

## Example

### Input

```
3 3
3 2 1
1 2 3
3 2 1
1 2 3
3 2 1
1 2 3
```

### Output

```
1
```

---

## Language

Java

---

## Author

Vikas
