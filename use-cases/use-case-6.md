# USE CASE: 6 View employee's details and promote employee

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to view and employee's details so that the employee's promotion request can be supported.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee's details. Database contains employee's details.

### Success End Condition

The details are available for the HR advisor to request promotion.

### Failed End Condition

No details are shown, therefor no promotion is requested.

### Primary Actor

HR Advisor.

### Trigger

A request from an employee is sent to HR.

## MAIN SUCCESS SCENARIO

1. A certain employee requests a promotion to the HR.
2. HR advisor captures details of the employee.
3. HR advisor views employee details on database.
4. HR advisor requests promotion for employee.

## EXTENSIONS

3. **Employee details do not exist**:
    i. HR advisor can't request promotion.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0