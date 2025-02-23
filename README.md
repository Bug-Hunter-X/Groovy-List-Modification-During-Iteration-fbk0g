# Groovy List Modification During Iteration Bug

This repository demonstrates a subtle but common bug in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The code `unusualBug.groovy` shows the problematic behavior, while `unusualBugSolution.groovy` provides a corrected version.

## The Problem

Modifying a list while iterating over it with `eachWithIndex` can lead to unexpected results because the index and the list's contents become inconsistent.  Elements may be skipped, or exceptions might occur depending on the specifics of the list and the modification.

## The Solution

The best approach is to create a new list containing only the elements you want to keep. This avoids modifying the list during iteration.