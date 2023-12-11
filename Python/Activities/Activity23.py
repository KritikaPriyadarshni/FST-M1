import pytest

from activities.confest import num_list


def sum_list():
    add = 0

    for n in num_list():
        add = add + n

    assert add == 55
