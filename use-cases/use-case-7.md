# USE CASE: 7 Update employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to update an employee's details so that employee's details are kept up-to-date.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee's details to update. Database contains current employee details.

### Success End Condition

The employee's details are updated.

### Failed End Condition

The employee's details remain unchaged and are not up to date.

### Primary Actor

HR Advisor.

### Trigger

An employee's details need to be updated.

## MAIN SUCCESS SCENARIO

1. An employee's details have changed.
2. HR advisor captures employee's new details.
3. HR advisor gets employee's old details from the database.
4. HR advisor updates employee's details.

## EXTENSIONS

3. **Employee details do not exist**:
    i. HR advisor creates new employee's details.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0