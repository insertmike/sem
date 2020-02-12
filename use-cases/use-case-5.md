# USE CASE: 5 Add new employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to add a new employee's details so that I can ensure the new employee is paid.

### Scope

Company.

### Level

Primary task.

### Preconditions

We have the new employee's details. Database allows to add new employee's details.

### Success End Condition

Employee's details are added therefor he can be paid.

### Failed End Condition

Employee's details are not added.

### Primary Actor

HR Advisor.

### Trigger

A new employee is hired.

## MAIN SUCCESS SCENARIO

1. A new employee is hired.
2. HR advisor captures name of the role to get salary information for.
3. HR advisor extracts current salary information of all employees of the given role.
4. HR advisor provides report to finance.

## EXTENSIONS

3. **Role does not exist**:
    i. HR advisor informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0