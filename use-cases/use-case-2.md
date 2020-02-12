# USE CASE: 2 Produce salary report of a given department

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to produce a report on the salary of employees in a department so that I can support financial reporting of the organisation.

### Scope

Company

### Level

Primary task

### Preconditions

We know the department. Database contains current employee salary data.

### Success End Condition

A report is available for HR to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

HR advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance requests salary information for employees from a department.
2.HR advisor captures name of the department to get salary information from.
3.HR advisor extracts current salary information for given department.
4.HR advisor provides report to finance.

## EXTENSIONS

3.**Department does not exist**:
    i.HR advisor informs finance no department exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
