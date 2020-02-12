# USE CASE: 8 Delete an employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee's details to delete. Database contains current employee details.

### Success End Condition

The employee's details are deleted.

### Failed End Condition

The employee's details remain in the database.

### Primary Actor

HR Advisor.

### Trigger

An employee's details need to be deleted.

## MAIN SUCCESS SCENARIO

1. An employee's details need to be deleted.
2. HR advisor captures employee's details.
3. HR advisor deletes employee's details.

## EXTENSIONS

3. **Employee details do not exist**:
    i. HR advisor doesn't have to do anything. 

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0